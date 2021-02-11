public class Tester {
    public static void main(String[] args) {
       Employee[] employee = new Employee[3];

        employee[0] = new Employee("RSSNDR95A01F205V", "Rossi", "Andrea", 20123, "Milano",
                2021, 1000);

        employee[1] = new Employee("NRENNA90E41F704U", "Nero", "Anna", 20900, "Monza",
                2000, 3050);

        employee[2] = new Employee("BNCTNO98A01H501P", "Bianchi", "Toni", 3000, "Roma",
                2010, 2790);

        visualize(employee);
    }
    public static void visualize(Employee[] employee){
        int max;
        int eordinato[] = new int[3];

        for(int i =0; i<employee.length; i++){
            eordinato[i]=i;
        }
        for(int x= 0; x< employee.length; x++){
            for (int y =x+1;y< employee.length; y++){
                if(employee[x].gainsMore(employee[y])){
                    max = eordinato[x];
                    eordinato[x] = eordinato[y];
                    eordinato[y] = max;
                }
            }

        }
        for(int i =employee.length-1; i>=0; i--){
            System.out.println("Cognome: "+ employee[eordinato[i]].getSurename());
            System.out.println("Nome: "+employee[eordinato[i]].getName());
            System.out.println("Anno assunzione: "+employee[eordinato[i]].getAnno_assunzione());
            System.out.println("Stipendio: "+employee[eordinato[i]].getStipendio());
            System.out.println();
        }
        }

    }



