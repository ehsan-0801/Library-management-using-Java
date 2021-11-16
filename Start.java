import package1.*;
import package2.*;
import package3.*; 

import java.util.*;
import java.io.*;
import java.lang.*;



public class Start{
    public static void main(String[] args) {
        int numOfBooksAdded = 0;
        int numOfStudents = 0;
        int numOfTeachers = 0;

        Student s[] = new Student[20];
        Teacher t[] = new Teacher[20];
        Book b[] = new Book[20];
        Library l = new Library();
        Librarian lb=new Librarian();

        FileReadWrite fileObject = new FileReadWrite() ;

        System.out.println(" ");
        System.out.println("\t!----Library Management System----!");


        int condition1 = 1;
        while (condition1 != 0) {
            System.out.println(" ");
            System.out.println("1.Student Management");
            System.out.println("2.Teacher Management");
            System.out.println("3.Book Management");
            System.out.println("4.Basic Operations");
            System.out.println("5.Exit");

            System.out.println(" ");
            System.out.print("Choose an option: ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    
                    System.out.println("\t--Student Management--");
                    System.out.println("\t1.Insert New Student");
                    System.out.println("\t2.Remove Existing Student");
                    System.out.println("\t3.Show All Student");
                    System.out.println(" ");
                    System.out.print("\tEnter your choice: ");
                    int choice2 = input.nextInt();

                    switch (choice2) {

                        case 1:
                            Scanner size1 = new Scanner(System.in);
                            System.out.print("How many Student: ");
                            int size = size1.nextInt();
                            try {
                                for (int i = 0; i < size; i++) {
                                    System.out.println(" ");
                                    Scanner input1 = new Scanner(System.in);

                                    System.out.print("Enter Student Name: ");
                                    String name = input1.nextLine();

                                    System.out.print("Enter Student Id: ");

                                    String id = input1.nextLine();

                                    System.out.print("Enter Student Department Name: ");
                                    String dept = input1.nextLine();

                                    System.out.print("Enter Student Contact No: ");
                                    String contact = input1.nextLine();

                                    System.out.print("Enter Student Email: ");
                                    String email = input1.nextLine();

                                    System.out.print("Enter Student Address: ");
                                    String address = input1.nextLine();

                                    System.out.print("Enter Student Guardian Name: ");
                                    String guardianName = input1.nextLine();

                                    System.out.print("Enter Student Guardian Contact No: ");
                                    String guardianCN = input1.nextLine();

                                    // Student s[]=new Student[size];


                                    s[i] = new Student(id, name, dept, email, contact, address, guardianName, guardianCN);
                                    System.out.println(" ");
                                    
                                     numOfStudents++;
                                    //Library l=new Library();

                                    l.insertStudent(s);



                                }
                                for (int v = 0; v <  numOfStudents; v++) {
                                    s[v].showInfo();
                                    System.out.println("               ");
                                }	
                            }
                             catch (Exception e) {
                                System.out.println(e);
                            }



                            /*        try{

								Formatter f=new Formatter("C:/Users/!--Rifat Ishtiyak--!/Desktop/project/Files/Student.txt");
							   	f.format("%s %s %s %s %s %s %s %s\r\n","Name","ID","Dept","Contact","Email","Address","GuardianName","GuardianCN");
							   	f.format("%s %s %s %s %s %s %s %s\r\n",name,id,dept,contact,email,address,guardianName,guardianCN);

							   	f.close();
							    

							    }
							    catch(Exception e){
							    	System.out.println(e);
							    }
						*/

                            break;

                        case 2:
                            size = 3;
                            System.out.println(" ");
                            System.out.print("Enter id to delete: ");
                            Scanner index = new Scanner(System.in);
                            int k = index.nextInt();
                            l.removeStudent(k);
                            try {
                                //	s[k]=null;
                                for (int i = k; i < size; i++) {
                                    s[i] = s[i + 1];
                                }
                                size--;
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;

                        case 3:
                            size = 3;
                            try {

                                l.showAllStudents();

                            } catch (Exception e) {

                            }
                            break;
                    }


                    break;

                case 2:

                    System.out.println("\t--Teacher Management--");
                    System.out.println("\t1.Insert New Teacher");
                    System.out.println("\t2.Remove Existing Teacher");
                    System.out.println("\t3.Show All Teacher");
                    System.out.println(" ");
                    System.out.print("\tEnter your choice: ");
                    int choice3 = input.nextInt();

                    switch (choice3) {

                        case 1:
                            Scanner size1 = new Scanner(System.in);
                            System.out.print("How many Teacher: ");
                            int size = size1.nextInt();
                            try {
                                for (int i = 0; i < size; i++) {
                                    System.out.println(" ");
                                    Scanner input1 = new Scanner(System.in);

                                    System.out.print("Enter Teacher Name: ");
                                    String name = input1.nextLine();

                                    System.out.print("Enter Teacher Id: ");

                                    String id = input1.nextLine();

                                    System.out.print("Enter Teacher Department Name: ");
                                    String dept = input1.nextLine();

                                    Scanner inpr=new Scanner(System.in);

                                    System.out.print("Enter Teacher's Office Room No : ");
                                    int roomNo = inpr.nextInt();

                                    System.out.print("Enter Teacher Contact No: ");
                                    String contact = input1.nextLine();

                                    System.out.print("Enter Teacher Email: ");
                                    String email = input1.nextLine();

                                    System.out.print("Enter teacher Address: ");
                                    String address = input1.nextLine();

                                    // Student s[]=new Student[size];


                                    t[i] = new Teacher(id, name, dept,roomNo, email, contact, address);
                                    System.out.println(" ");
                                    numOfTeachers++;

                                    l.insertTeacher(t);
                                }
                                for (int u = 0; u <  numOfTeachers; u++) {
                                    t[u].showInfo();
                                    System.out.println("               ");
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                            break;

                        case 2:
                            size = 3;
                            System.out.println(" ");
                            System.out.print("Enter Teacher ID to delete: ");
                            Scanner index = new Scanner(System.in);
                            int k = index.nextInt();
                            l.removeTeacher(k);
                            try {
                                //	s[k]=null;
                                for (int i = k; i < size; i++) {
                                    t[i] = t[i + 1];
                                }
                                size--;
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;

                        case 3:
                            size = 3;
                            try {

                                l.showAllTeachers();
                            } catch (Exception e) {

                            }
                            break;
                    }



                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("\t--Book Management--");
                    System.out.println("\t1.Insert New Book");
                    System.out.println("\t2.Remove Existing Book");
                    System.out.println("\t3.Show All Books");
                    System.out.println(" ");
                    System.out.print("\tEnter your choice: ");
                    int choice4 = input.nextInt();

                    switch (choice4) {

                        case 1:
                            Scanner size1 = new Scanner(System.in);
                            System.out.print("How many Books: ");
                            int size = size1.nextInt();
                            try {
                                for (int i = 0; i < size; i++) {
                                    System.out.println(" ");
                                    Scanner input1 = new Scanner(System.in);

                                    System.out.print("Enter Book ID: ");
                                    int id = input1.nextInt();

                                    Scanner input2 = new Scanner(System.in);
                                    System.out.print("Enter Book Title: ");
                                    String title = input2.nextLine();

                                    System.out.print("Enter Sub-Title: ");
                                    String subTitle = input2.nextLine();

                                    System.out.print("Enter Author name: ");
                                    String authorName = input2.nextLine();

                                    System.out.print("Enter Publisher Name: ");
                                    String publisherName = input2.nextLine();

                                    Scanner input3 = new Scanner(System.in);
                                    System.out.print("Enter Price: ");
                                    double price = input3.nextDouble();

                                    Scanner input4 = new Scanner(System.in);
                                    System.out.print("Enter No of Copy: ");
                                    int copy = input4.nextInt();


                                    b[i] = new Book();
                                    b[i].setId(id);
                                    b[i].setTitle(title);
                                    b[i].setSubTitle(subTitle);
                                    b[i].setAuthorName(authorName);
                                    b[i].setPublisherName(publisherName);
                                    b[i].setPrice(price);
                                    b[i].setNoOfCopy(copy);

                                    numOfBooksAdded++;

                                    System.out.println(" ");


                                    l.insertBook(b);
                                }
                                for (int i = 0; i < numOfBooksAdded; i++) {
                                    b[i].showInfo();
                                    System.out.println("               ");

                                }
                            } catch (Exception e) {
                                System.out.println("Please Enter correct input");
                                System.out.println(e);
                            }

                            break;

                        case 2:

                            System.out.println(" ");
                            System.out.print("Enter Book ID to delete: ");
                            Scanner index = new Scanner(System.in);
                            int k = index.nextInt();
                            l.removeBook(k);
                            try {
                                //	s[k]=null;
                                for (int i = k; i < numOfBooksAdded; i++) {
                                    b[i] = b[i + 1];
                                }
                                numOfBooksAdded--;
                            } catch (Exception e) {
                                System.out.println("Please Enter correct input");
                                System.out.println(e);
                            }
                            break;

                        case 3:
                            //numOfBooksAdded = 3;
                            try {

                                System.out.println("Total book: " + numOfBooksAdded);
                                l.showAllBooks();

                            } catch (Exception e) {

                            }
                            break;
                    }


                    break;

                case 4:
                    System.out.println("\t--Borrow/Lost Management--");
                    System.out.println("\t1.Borrow Book");
                    System.out.println("\t2.Return Book");
                    System.out.println("\t3.Generate fine");
                    System.out.println(" ");
                    System.out.print("\tEnter your choice: ");
                    int choice5 = input.nextInt();
                    switch (choice5) {
                        case 1:
                        	System.out.print("1.Student     2.teacher");
                        	Scanner ch = new Scanner(System.in);
                        	int x=ch.nextInt();
                        	try{
                        		if(x==1){
		                            System.out.println("Books available--:");
		                            for (int i = 0; i < numOfBooksAdded; i++) {
                                        b[i].showInfo();
                                        System.out.println(" ");
		                            }
		                            System.out.println("Student id :");
	                            	Scanner Sno = new Scanner(System.in);
	                            	int st = Sno.nextInt();
	                            	
	                            	
		                            System.out.print("which book you want to borrow, put the number?:");
		                            Scanner bor = new Scanner(System.in);
		                            int j = bor.nextInt();

		                            System.out.print("How many copy do you want ?(not more than 2)");
		                            Scanner cp = new Scanner(System.in);
		                            int g = cp.nextInt();
		                            if (g > 2) {
		                                System.out.print("Wrong Input");
		                            } else {
		                                b[j - 1].setNoOfCopy(b[j - 1].getNoOfCopy() - g);
                                        s[st-1].borrow(s[st-1],b[j-1]);
                        

                                    fileObject.createDirectory();
                                    fileObject.writeInFile("Id no: "+j+" book is borrowed by Student whose id is "+st) ;


		                            }

                            	}

                        		else{
	                        		 System.out.println("Books available--:");
		                            for (int i = 0; i < numOfBooksAdded; i++) {
                                        b[i].showInfo();
                                        System.out.println(" ");
		                            }
		                            System.out.println("teacher ID :");
	                            	Scanner tno = new Scanner(System.in);
	                            	int th = tno.nextInt();
	                            	
	                            	
		                            System.out.print("which book you want to borrow ? put the id number :");
		                            Scanner bort = new Scanner(System.in);
		                            int m = bort.nextInt();

		                            System.out.print("How many Copy?(not more than 2)");
		                            Scanner cp = new Scanner(System.in);
		                            int h = cp.nextInt();
		                            if (h > 2) {
		                                System.out.print("Wrong Input");
		                            } else {
		                                b[m - 1].setNoOfCopy(b[m - 1].getNoOfCopy() - h);
                                        s[th-1].borrow(t[th-1],b[m-1]);
                                        
                                    
                                        fileObject.writeInFile("Id no: "+th+" book is borrowed by teacher whose id is "+m) ;
    

		                            }
	                        	}
	                        }
	                        catch(Exception e)
	                        	{
                                    System.out.println("Please Enter correct input");
                                    System.out.println(e);
	                        	}





                            break;
                        case 2:
                        	System.out.print("1.Student     2.teacher");
                        	Scanner chl = new Scanner(System.in);
                        	int z=chl.nextInt();
                        	try{
                        		if(z==1){
	                        		System.out.println("Student id no :");
		                            	Scanner Sno = new Scanner(System.in);
		                            	int str = Sno.nextInt();
		                            System.out.print("which book you want to return, put the id number?:");
		                            Scanner ret = new Scanner(System.in);
		                            int f = ret.nextInt();
		                            System.out.print("How many Copy?");
		                            Scanner qg = new Scanner(System.in);
		                            int w = qg.nextInt();


		                            b[f - 1].setNoOfCopy(b[f - 1].getNoOfCopy() + w);
                                    s[str-1].ret(s[str-1],b[f-1]);

                                    System.out.println("-------Successfully Returned------");
                                    
                                    fileObject.writeInFile("Id no: "+f+" book is returned by Student whose id is "+str);
                                    
	                        	}
	                        else
	                        	{
	                        		System.out.println("Teacher id no :");
	                            	Scanner Sno = new Scanner(System.in);
	                            	int stv = Sno.nextInt();
	                            System.out.print("which book you want to return, put the number?:");
	                            Scanner ret = new Scanner(System.in);
	                            int ft = ret.nextInt();
	                            System.out.print("How much Copy?");
	                            Scanner qg = new Scanner(System.in);
	                            int wq = qg.nextInt();


	                            b[ft - 1].setNoOfCopy(b[ft - 1].getNoOfCopy() + wq);
                                s[stv-1].ret(s[stv-1],b[ft-1]);

                                System.out.println("-------Successfully Returned------");
                                
                                fileObject.writeInFile("Id no: "+ft+" book is returned by Teacher whose id is "+stv);

	                        	}
	                        }	
	                        catch (Exception e) {
                                System.out.println("Please Enter correct input");
                                System.out.println(e);
                            }
                        	



                            break;

                        case 3:
                        	System.out.print("1.Student     2.teacher");
                        	Scanner chs = new Scanner(System.in);
                        	int y=chs.nextInt();
                        try{
                        	if(y==1){	

                            	System.out.println("which Student?:");
                            	Scanner Sno = new Scanner(System.in);
                            	int st = Sno.nextInt();
                            	System.out.print("Amount:  ");
                            	Scanner pg = new Scanner(System.in);
                            	double h2 = pg.nextDouble();
                            	s[st-1].fine(s[st-1],h2);
                        }
                        else
                        {	
                            	System.out.println("which teacher?:");
                            	Scanner tno = new Scanner(System.in);
                            	int th = tno.nextInt();
                            	System.out.print("Amount:  ");
                            	Scanner qg = new Scanner(System.in);
                            	double h3 = qg.nextDouble();
                            	t[th-1].setAmount(h3);
                            	t[th-1].fine(t[th-1],h3);
                            	//lb.generateFine(s[th-1].getId(),h3);


                            }
                    }
                    catch (Exception e) {
                                 System.out.println("Please Enter correct input");
                                System.out.println(e);
                            }
                       
                        



                    break;
					}	
				break;


                case 5:
                    System.out.println("\t!---Successfully exited from System---!");
                    condition1 = 0;
                    break;

                }
            }


        }

    }
