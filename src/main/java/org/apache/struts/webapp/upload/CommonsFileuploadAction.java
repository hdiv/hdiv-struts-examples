package org.apache.struts.webapp.upload;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CommonsFileuploadAction extends Action {

	@Override
	public ActionForward execute(final ActionMapping mapping, final ActionForm form, final HttpServletRequest request,
			final HttpServletResponse response) throws Exception {

		if (ServletFileUpload.isMultipartContent(request)) {

			try {
				// Create a factory for disk-based file items
				DiskFileItemFactory factory = new DiskFileItemFactory();

				// Configure a repository (to ensure a secure temp location is used)
				ServletContext servletContext = request.getSession().getServletContext();
				File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
				factory.setRepository(repository);

				// Create a new file upload handler
				ServletFileUpload upload = new ServletFileUpload(factory);

				// Parse the request
				@SuppressWarnings("unchecked")
				List<FileItem> items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
					FileItem item = iter.next();
					if (item.isFormField()) {
						System.out.println("Form field: " + item.getFieldName() + " value: " + item.getString());

						// place the data into the request for retrieval from display.jsp
						if (item.getFieldName().equals("theText")) {
							request.setAttribute("text", item.getString());
						}
						if (item.getFieldName().equals("queryParam")) {
							request.setAttribute("queryValue", item.getString());
						}
					}
					else {
						System.out.println("File: " + item.getName() + " size: " + item.getSize());

						request.setAttribute("fileName", item.getName());
						request.setAttribute("contentType", item.getContentType());
						request.setAttribute("size", item.getSize());
						request.setAttribute("data", item.getString());
					}
				}
			}
			catch (FileUploadException e) {
				e.printStackTrace();
				return null;
			}
			// return a forward to display.jsp
			return mapping.findForward("display");
		}
		// this shouldn't happen in this example
		return null;
	}
}
