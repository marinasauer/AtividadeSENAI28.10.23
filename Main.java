package Principal;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        ProfessorDAO professor = new ProfessorDAO();
        professor.insert(new Professor("Fabio Santos", 40, 5780.00));


    }
}