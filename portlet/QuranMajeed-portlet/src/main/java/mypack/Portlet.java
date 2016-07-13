package mypack;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class Portlet extends GenericPortlet {
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		PortletRequestDispatcher dispatcher =
		getPortletContext().getRequestDispatcher("/html/orp_quran/common/view.jsp");
		dispatcher.include(request, response);
	}
}