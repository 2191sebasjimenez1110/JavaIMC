package gui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Logica;
import clases.UsuarioVo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtTalla;
	
	private JTextArea areaResultado;
	private JScrollPane scrollArea;
	
	private JButton btnCalcularPromedio;
	private JButton btnResgistrar;
	private JButton btnListaPersona;
	Logica miLog = new Logica();

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 661);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(24, 30, 67));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		
		JLabel etiTItulo = new JLabel("Calcular IMC");
		etiTItulo.setForeground(new Color(255, 255, 255));
		etiTItulo.setFont(new Font("Kristen ITC", Font.BOLD, 27));
		etiTItulo.setBounds(286, 11, 192, 53);
		contentPane.add(etiTItulo);
		
		JLabel lblIngresoDatos = new JLabel("Ingreso De Datos:");
		lblIngresoDatos.setForeground(new Color(255, 255, 255));
		lblIngresoDatos.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngresoDatos.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		lblIngresoDatos.setBounds(10, 57, 206, 41);
		contentPane.add(lblIngresoDatos);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setVerticalAlignment(SwingConstants.TOP);
		lblNombre.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblNombre.setBounds(300, 113, 102, 20);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setForeground(new Color(255, 255, 255));
		lblEdad.setVerticalAlignment(SwingConstants.TOP);
		lblEdad.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblEdad.setBounds(639, 113, 76, 20);
		contentPane.add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(255, 255, 255));
		lblPeso.setVerticalAlignment(SwingConstants.TOP);
		lblPeso.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblPeso.setBounds(174, 155, 76, 20);
		contentPane.add(lblPeso);
		
		JLabel lblTalla = new JLabel("Talla:");
		lblTalla.setForeground(new Color(255, 255, 255));
		lblTalla.setBackground(new Color(255, 255, 255));
		lblTalla.setVerticalAlignment(SwingConstants.TOP);
		lblTalla.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblTalla.setBounds(10, 153, 76, 20);
		contentPane.add(lblTalla);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setForeground(new Color(255, 255, 255));
		lblDocumento.setVerticalAlignment(SwingConstants.TOP);
		lblDocumento.setFont(new Font("Lucida Sans", Font.PLAIN, 18));
		lblDocumento.setBounds(10, 113, 128, 20);
		contentPane.add(lblDocumento);
		
		JLabel etiResultado = new JLabel("Resultado:");
		etiResultado.setForeground(new Color(255, 255, 255));
		etiResultado.setHorizontalAlignment(SwingConstants.LEFT);
		etiResultado.setFont(new Font("Lucida Sans", Font.PLAIN, 20));
		etiResultado.setBounds(10, 202, 206, 32);
		contentPane.add(etiResultado);
		
		txtDocumento = new JTextField();
		txtDocumento.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtDocumento.setBackground(new Color(211, 211, 211));
		txtDocumento.setBounds(123, 113, 157, 20);
		contentPane.add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtNombre.setBackground(new Color(211, 211, 211));
		txtNombre.setBounds(384, 113, 233, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtEdad.setBackground(new Color(211, 211, 211));
		txtEdad.setColumns(10);
		txtEdad.setBounds(693, 114, 76, 20);
		contentPane.add(txtEdad);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPeso.setBackground(new Color(211, 211, 211));
		txtPeso.setColumns(10);
		txtPeso.setBounds(227, 155, 76, 20);
		contentPane.add(txtPeso);

		txtTalla = new JTextField();
		txtTalla.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtTalla.setBackground(new Color(211, 211, 211));
		txtTalla.setColumns(10);
		txtTalla.setBounds(62, 154, 76, 20);
		contentPane.add(txtTalla);
		
		scrollArea = new JScrollPane();
		scrollArea.setBounds(10, 236, 768, 321);
		contentPane.add(scrollArea);
		
		areaResultado = new JTextArea();
		areaResultado.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		scrollArea.setViewportView(areaResultado);
		
		btnResgistrar = new JButton("Registrar");
		btnResgistrar.setForeground(new Color(24, 30, 67));
		btnResgistrar.setBackground(new Color(211, 211, 211));
		btnResgistrar.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		btnResgistrar.setBounds(331, 575, 128, 30);
		btnResgistrar.addActionListener(this);
		contentPane.add(btnResgistrar);
		
		btnCalcularPromedio = new JButton("Promedio IMC");
		btnCalcularPromedio.setForeground(new Color(24, 30, 67));
		btnCalcularPromedio.setBackground(new Color(211, 211, 211));
		btnCalcularPromedio.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		btnCalcularPromedio.setBounds(630, 575, 148, 30);
		btnCalcularPromedio.addActionListener(this);
		contentPane.add(btnCalcularPromedio);
		
		btnListaPersona = new JButton("Consultar Lista");
		btnListaPersona.setForeground(new Color(24, 30, 67));
		btnListaPersona.setBackground(new Color(211, 211, 211));
		btnListaPersona.setFont(new Font("Lucida Sans", Font.PLAIN, 16));
		btnListaPersona.setBounds(469, 575, 148, 30);
		btnListaPersona.addActionListener(this);
		contentPane.add(btnListaPersona);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnResgistrar) {
			UsuarioVo miUser = new UsuarioVo();
			
			miUser.setDocumento(txtDocumento.getText());
			miUser.setNombre(txtNombre.getText());
			miUser.setEdad(Integer.parseInt(txtEdad.getText()));
			miUser.setPeso(Double.parseDouble(txtPeso.getText()));
			miUser.setTalla(Double.parseDouble(txtTalla.getText()));
			
			String registro = miLog.Registrar(miUser);
			
			areaResultado.setText(registro);
		}else if (e.getSource() == btnListaPersona) {
			String lista = miLog.imprimirLista();
			
			areaResultado.setText(lista);
			
		} else if (e.getSource() == btnCalcularPromedio) {
			String promedio = miLog.calcularPromedio();
			
			areaResultado.setText(promedio);
		}
		
	}

	
}
