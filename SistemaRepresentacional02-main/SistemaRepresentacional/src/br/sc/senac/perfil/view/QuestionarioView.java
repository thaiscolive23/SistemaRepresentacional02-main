package br.sc.senac.perfil.view;

import javax.swing.*;

public class QuestionarioView extends  JFrame{
    private JPanel pnlquestionario;
    private JLabel lblteste;
    private JLabel lblquetao1;
    private JTextField txtintuicao;
    private JTextField txtsoa;
    private JTextField txtparece;
    private JTextField txtestudo;
    private JLabel lblquestao2;
    private JTextField txtvoz;
    private JTextField txtargumento;
    private JTextField txtlogica;
    private JTextField txtcontato;
    private JLabel lblquestao3;
    private JTextField txtmodo;
    private JLabel lblintuicao;
    private JLabel lblsoa;
    private JLabel lblparece;
    private JLabel lblestudo;
    private JLabel lblvoz;
    private JLabel lblargumento;
    private JLabel lbllogica;
    private JLabel lblcontato;
    private JTextField txtsentimentos;
    private JTextField txtpalavra;
    private JTextField txttom;
    private JLabel lblmodo;
    private JLabel lblsentimentos;
    private JLabel lblpalavra;
    private JLabel lbltom;
    private JLabel lblquestao4;
    private JTextField txtvolume;
    private JTextField txtselecionar;
    private JTextField txtescolhermoveis;
    private JTextField txtescolhercombinacoes;
    private JLabel lblvolume;
    private JLabel lblselecionar;
    private JLabel lblescolhermoveis;
    private JLabel lblescolhercombinacoes;
    private JLabel lblquestao5;
    private JTextField txtsintonia;
    private JTextField txtcapaz;
    private JTextField txtsensivel;
    private JTextField txtrespondo;
    private JLabel lblsintonia;
    private JLabel lblcapaz;
    private JLabel lblsensivel;
    private JLabel lblrespondo;
    private JLabel lblperfil;

    public QuestionarioView(){
        initComponents();

    }
    public void initComponents(){
        setTitle("Tela de sistema");
        setSize(1280,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlquestionario);
        setVisible(true);

    }

}
