public class Qualification {

    public static void main(String[] args) {

        String[] names = {"Ana", "Luis", "María", "Pedro", "Sofía"};
        double[] qualification = {18.5, 16.0, 19.2, 15.7, 18.5};

        for (int i = 0; i < 3; i++) { 
            for (int j = i + 1; j < qualification.length; j++) {
                
                if (qualification[j] > qualification[i]) {
                    
                    double tempNota = qualification[i];
                    qualification[i] = qualification[j];
                    qualification[j] = tempNota;
                
                    String tempNombre = names[i];
                    names[i] = names[j];
                    names[j] = tempNombre;
                }
            }
        }

        System.out.println("TOP 3 STUDENTS:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + names[i] + ": " + qualification[i]);
        }
    }
}

//