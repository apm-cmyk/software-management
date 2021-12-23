package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemProject;
	@FXML
	private MenuItem menuItemRequirement;
	@FXML
	private MenuItem menuItemActive;
	@FXML
	private MenuItem menuItemClose;
	@FXML
	private MenuItem menuItemAbout;
	

	@FXML
	public void onMenuItemProjectAction() {
		System.out.println("Project");
	}
	
	@FXML
	public void onMenuItemRequirementAction() {
		System.out.println("Requirement");
	}
	
	@FXML
	public void onMenuItemActiveAction() {
		System.out.println("Active");
	}
	
	@FXML
	public void onMenuItemCloseAction() {
		System.out.println("Close");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("About");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	

}
