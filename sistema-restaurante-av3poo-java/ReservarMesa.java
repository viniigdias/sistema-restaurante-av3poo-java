import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReservarMesa extends JFrame implements ActionListener {
    private JButton[] buttons;
    private String[] mesaStatus;

    public ReservarMesa() {
        super("Restaurante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 5));


        buttons = new JButton[10];
        mesaStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("Mesa " + (i + 1));
            buttons[i].addActionListener(this);
            add(buttons[i]);


            mesaStatus[i] = "Disponível";
        }

        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setBackground(Color.RED);
        button.setEnabled(false);

        int mesaIndex = Integer.parseInt(button.getText().replace("Mesa ", "")) - 1;
        mesaStatus[mesaIndex] = "Indisponível";

        salvarEstadoMesas();
    }

    private void salvarEstadoMesas() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("estado_mesas.txt"));

            for (int i = 0; i < 10; i++) {
                writer.write("Mesa " + (i + 1) + ": " + mesaStatus[i]);
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReservarMesa gui = new ReservarMesa();
            gui.setVisible(true);
        });
    }
}

