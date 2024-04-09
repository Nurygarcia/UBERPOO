class Drive extends Account{
public Drive (String name, String document, String email, String password){
    super(name,document,email,password);
}

void printDataDrive(){
    System.out.println("Document drive:" + document + "Name drive:" + name + "E-,mail:" + email + "password:"+password);

    }
}