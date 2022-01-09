package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

//Class responsible to give the user the choice to go into course or module management
class ManageView extends View {

    ManageView(GUI baseUI) {
        super(baseUI);
    }

    // Only one view necessary to show the users the available management options.
    // Method. Makes a pathway to both.
    @Override
    protected void createView() {
        // setting the layout of the view
        GridPane view = generateGrid();

        // Buttons including the action events
        Button courseManageBtn = new Button("Course");
        courseManageBtn
                .setOnMouseClicked(clicked -> new CourseManagementView(this.gui).createView());
        Button moduleManageBtn = new Button("Module");
        moduleManageBtn.setOnMouseClicked(clicked -> new ModuleManagementView(this.gui).createView());
        Button studentManageBtn = new Button("Student");
        studentManageBtn.setOnMouseClicked(clicked -> new StudentManagementView(this.gui).createView());
        Button webcastManageBtn = new Button("Webcast");
        webcastManageBtn.setOnMouseClicked(clicked -> new WebcastManageView(this.gui).createView());
        Button certificateBtn = new Button("Certificaten toevoegen");
        certificateBtn.setOnMouseClicked(clicked -> new CertificateSubmissionView(this.gui).createView());
        // Futher layout setup
        view.add(courseManageBtn, 0, 0);
        view.add(moduleManageBtn, 0, 1);
        view.add(studentManageBtn, 1, 0);
        view.add(webcastManageBtn, 0, 2);
        view.add(certificateBtn, 1, 1);
        view.setPadding(new Insets(40, 0, 0, 0));
        view.setHgap(40);

        activate(view, "Manage");
    }

}
