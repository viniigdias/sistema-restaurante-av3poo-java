import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Caixa extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public Caixa() {
        setTitle("Caixa");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("O que você deseja no Caixa?");
        label.setBounds(50, 30, 200, 30);
        add(label);

        button = new JButton("Abrir o Caixa");
        button.setBounds(80, 80, 140, 30);
        button.addActionListener(this);
        add(button);

        button = new JButton("Fechar o caixa");
        button.setBounds(80, 80, 140, 30);
        button.addActionListener(this);
        add(button);

    }

    public static void main(String[] args) {
        Caixa gui = new Caixa();
        gui.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Abra um JOptionPane para exibir as opções disponíveis
        String[] opcoes = { "Adicionar Dinheiro", "Trocar Dinheiro", "Fechar o Caixa" };
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (escolha != JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Opção selecionada: " + opcoes[escolha]);
        }
    }
}