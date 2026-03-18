package Lab5;

import java.util.ArrayList;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0]=new Employee("Ann",1500);
        arr[1]=new Employee("Bob",500);
        arr[2]=new Employee("Jack",2500);
        arr[3]=new Employee("Dan",1800);
        arr[4]=new Employee("Jane",4700);


        for (int i=0;i<arr.length;i++){
            int minidex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].salary<arr[minidex].salary){
                    minidex=j;
                }
            }
            if(minidex!=i){
                Employee temp = arr[i];
                arr[i]=arr[minidex];
                arr[minidex]=temp;


            }
        }

    }
}

