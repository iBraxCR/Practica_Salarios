import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int horas;
        int ganancia;
        int horasextras;

        // Se le pide al usuario la cantidad de horas trabajadas
        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas trabajadas"));

        // Si la cantidad de horas trabajadas es menor o igual a 40, se le paga a 16 x h 
        if (horas <= 40) {
            ganancia = horas * 16;
            JOptionPane.showMessageDialog(null, "Se le paga a 16 x h. Usted trabajó la cantidad de 40 horas o menos, Cantidad de horas registradas: " + horas + "h Se le paga la cantidad de: " + ganancia);
        } else {
            // Calculamos las horas extras trabajadas
            horasextras = (horas - 40) * 20;

            // Calculamos la ganancia total sumando las horas normales y las horas extras
            ganancia = 40 * 16 + horasextras;

            JOptionPane.showMessageDialog(null, "Se le paga a 20 x h extra. Usted trabajó más de 40 horas, Cantidad de horas extra registradas: " + (horas - 40) + "h Se le paga la cantidad de: " + ganancia);
        }
    }
}

