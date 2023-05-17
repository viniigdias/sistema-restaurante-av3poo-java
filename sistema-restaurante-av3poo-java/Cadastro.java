import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Cadastro {
    String [ ] c = new String [12];
    private String l, s, n, id;

    public void SetL (String l) {
        this.l = l;
    }

    public String getL() {
        return l;
    }

    public void SetS (String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void SetN (String n) {
        this.n = n;
    }

    public String getN() {
        return n;
    }

    public void SetId (String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private int cont = 0;
    public void fazerCadastro(String c[]) {

        for(int i = 1; i <= 2; i++){
            c[cont] = JOptionPane.showInputDialog("Digite o seu nome: ");
            cont = cont + 1;
            c[cont] = JOptionPane.showInputDialog("Digite a sua idade: ");
            cont = cont + 1;
            c[cont] = JOptionPane.showInputDialog("Crie um E-mail: ");
            cont = cont + 1;
            c[cont] = JOptionPane.showInputDialog("Crie uma senha para o login: ");
            cont = cont + 1;
        }
    }

    public void usuariosCadastrados(String s[]) {

        JOptionPane.showMessageDialog(null,"Os usuários cadastrados e seus dados são: " + "\n" + c[0] + "\n"  + c[1] + "\n" + c[2] + "\n" + c[3] + "\n");
        JOptionPane.showMessageDialog(null,"Os usuários cadastrados e seus dados são: " + "\n" + c[4] + "\n"  + c[5] + "\n" + c[6] + "\n" + c[7] + "\n");

    }

    public void salvarCadastroEmArquivo(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < c.length; i++) {
                writer.write(c[i]);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.fazerCadastro(cadastro.c);
        cadastro.usuariosCadastrados(cadastro.c);
        cadastro.salvarCadastroEmArquivo("cadastro.txt");
    }
}
