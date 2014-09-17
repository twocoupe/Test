package com.amaranthdreams.client.client;

import com.google.gwt.core.client.*;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.*;

public class Adems implements EntryPoint{

	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */

	private HorizontalPanel hHeader;
	TabLayoutPanel tabPanel;
	private Clients clientsPane;	

	public void onModuleLoad() {

		Image header = new Image("/images/GUI_Logo.jpg");
		hHeader = new HorizontalPanel();
		hHeader.add(header);
		hHeader.addStyleName("Header");
		RootLayoutPanel.get().add(hHeader);

		// Create a tab panel
		tabPanel = new TabLayoutPanel(2.5, Unit.EM);
		tabPanel.setAnimationDuration(1000);
		tabPanel.getElement().getStyle().setMarginBottom(10.0, Unit.PX);
		tabPanel.getElement().getStyle().setMarginTop(147.0, Unit.PX);

		// Add a home tab
		Label homeText = new Label("Home");
		tabPanel.add(homeText, "Home");

		// Add Clients Tab
		clientsPane = new Clients();		    
		tabPanel.add(clientsPane.hPanel1, "Clients");

		// Add Invoices Tab
		Label InvoicesText = new Label("Invoices");
		tabPanel.add(InvoicesText, "Invoices");

		// Sets default tab
		tabPanel.selectTab(0);
		hHeader.add(tabPanel);
		/*tabPanel.addSelectionHandler(new SelectionHandler<Integer> () {
		      public void onSelection(SelectionEvent<Integer> event) {
		          if (tabPanel.getSelectedIndex() == 2)
		        	  tabPanel.getTabWidget(clientsPane.asWidget());
		        }
		      });
*/
	RootLayoutPanel.get().add(tabPanel);

	}

}