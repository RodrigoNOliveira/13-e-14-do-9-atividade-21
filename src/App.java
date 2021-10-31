import javax.swing.JOptionPane;

class App {
    public static void main(String[] args) {

        String x = JOptionPane.showInputDialog(null, "Digite o número para saber o dia da semana (1 a 7)",
                "Dias da semana", JOptionPane.QUESTION_MESSAGE);

        int y = Integer.parseInt(x);

        switch (y) {
        case 1:

            JOptionPane.showMessageDialog(null, "Numero digitado: " + y + " é domingo", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        case 2:
            JOptionPane.showMessageDialog(null, "Numero digitado: " + y + " é segunda-feira", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        case 3:
            JOptionPane.showMessageDialog(null, "Numero digitado: " + y + " é terça-feira", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        case 4:
            JOptionPane.showMessageDialog(null, "Numero digitado:" + y + " é quarta-feira", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        case 5:
            JOptionPane.showMessageDialog(null, "Numero digitado:" + y + " é quinta-feira", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);

            break;

        case 6:
            JOptionPane.showMessageDialog(null, "Numero digitado:" + y + " é sexta-feira", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        case 7:
            JOptionPane.showMessageDialog(null, "Numero digitado:" + y + " é sabado", "Dias da semana",
                    JOptionPane.INFORMATION_MESSAGE);
            break;

        default:
            JOptionPane.showMessageDialog(null, "Número digitado invalido", "Dias da semana",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
}