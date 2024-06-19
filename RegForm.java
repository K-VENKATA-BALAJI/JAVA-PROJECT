// package javaprograms;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RegForm extends JFrame implements ActionListener {
JPanel p1;
JLabel lblStudentRegdno;
JTextField txtStudentRegdno;

JPanel p2;
JLabel lblStudentName;
JTextField txtStudentName;

JPanel p3;
JLabel lblStudentMobile;
JTextField txtStudentMobile;

JPanel p4;
JLabel lblCourse;
JRadioButton rbBtech;
JRadioButton rbMtech;
JRadioButton rbOtherCourse;
ButtonGroup bg1;

JPanel p5;
JLabel lblBranch;
JRadioButton rbECE;
JRadioButton rbEEE;
JRadioButton rbCSE;
JRadioButton rbIT;
JRadioButton rbOtherBranches;
ButtonGroup bg2;

JPanel p6;
JLabel lblSection;
JComboBox jcb;
String section[] = {"1","2","3","4","5","6","7","8"};

JPanel p7;
JButton btnSubmit;
JButton btnClear;

JPanel p8;
JLabel lblStatus;

RegForm(){
p1 = new JPanel();
lblStudentRegdno = new JLabel("Student Regd.No.:");
txtStudentRegdno = new JTextField(30);
p1.add(lblStudentRegdno);
p1.add(txtStudentRegdno);

p2 = new JPanel();
lblStudentName = new JLabel("Student Name:");
txtStudentName = new JTextField(30);
p2.add(lblStudentName);
p2.add(txtStudentName);

p3 = new JPanel();
lblStudentMobile = new JLabel("Student Mobile No.:");
txtStudentMobile = new JTextField(30);
p3.add(lblStudentMobile);
p3.add(txtStudentMobile);

p4 = new JPanel();
lblCourse = new JLabel("Course:");
rbBtech = new JRadioButton("B.Tech.");
rbMtech = new JRadioButton("M.Tech.");
rbOtherCourse = new JRadioButton("Others");
bg1 = new ButtonGroup();
bg1.add(rbBtech);
bg1.add(rbMtech);
bg1.add(rbOtherCourse);
p4.add(lblCourse);
p4.add(rbBtech);
p4.add(rbMtech);
p4.add(rbOtherCourse);

p5 = new JPanel();
lblBranch = new JLabel("Branch:");
rbECE = new JRadioButton("ECE");
rbEEE = new JRadioButton("EEE");
rbCSE = new JRadioButton("CSE");
rbIT = new JRadioButton("IT");
rbOtherBranches = new JRadioButton("Others");
bg2 = new ButtonGroup();
bg2.add(rbECE);
bg2.add(rbEEE);
bg2.add(rbCSE);
bg2.add(rbIT);
bg2.add(rbOtherBranches);
p5.add(lblBranch);
p5.add(rbECE);
p5.add(rbEEE);
p5.add(rbCSE);
p5.add(rbIT);
p5.add(rbOtherBranches);

p6 = new JPanel();
lblSection = new JLabel("Section: ");
jcb = new JComboBox(section);
p6.add(lblSection);
p6.add(jcb);

p7 = new JPanel();
btnSubmit = new JButton("Submit");
btnClear = new JButton("Clear");
p7.add(btnSubmit);
p7.add(btnClear);
btnSubmit.addActionListener(this);
btnClear.addActionListener(this);

p8 = new JPanel();
lblStatus = new JLabel();
p8.add(lblStatus);

add(p1);
add(p2);
add(p3);
add(p4);
add(p5);
add(p6);
add(p7);
add(p8);
setSize(500, 600);
setTitle("Registration Form");
setLayout(new GridLayout(10,1));
setVisible(true);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) {
RegForm f = new RegForm();
}

@Override
public void actionPerformed(ActionEvent e) {
if(e.getActionCommand() == "Submit") {
String status = "<html><body>Regd.No. = " + txtStudentRegdno.getText() +

" Name = " + txtStudentName.getText() +
" Mobile No.= " + txtStudentMobile.getText();

status += " <br>Course = ";
if(rbBtech.isSelected())
status += rbBtech.getText();
else if(rbMtech.isSelected())
status += rbMtech.getText();
else
status += rbOtherCourse.getText();
status += " Branch = ";
if(rbECE.isSelected())
status += rbECE.getText();
else if(rbEEE.isSelected())
status += rbEEE.getText();
else if(rbCSE.isSelected())
status += rbCSE.getText();
else if(rbIT.isSelected())
status += rbIT.getText();
else
status += rbOtherBranches.getText();
status += " Section = " + jcb.getSelectedItem() + "</html></body>";
lblStatus.setText(status);
}
else {
lblStatus.setText("");
}
}
}
