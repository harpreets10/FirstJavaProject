package program;

public class UserLogin {	
int i;	
String userid;
String password;
String entereduserid;
String enteredpassword;

void validateUseridAndPassword(){
while(i<=3) {
if(userid.equals(entereduserid) && password.equals(enteredpassword)) {
System.out.println("You are logged in to the application");
break;
}

else if(!userid.equals(enteredpassword) && !password.equals(enteredpassword)) {

System.out.println("incorrect userid and password try again");
i++;
}
else {
System.out.println("account has been locked");
break;
}	
}
}
}






