package controller;

import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UniversidadeControle implements Initializable{
	
	@FXML
	private MenuItem menuItemCadastrarUniversidade;
	@FXML
	private AnchorPane TelaCadastroUniversidade;
	
	@FXML
	private TextField txtId;
	@FXML
    private TextField txtCodigo;
	@FXML
	private Label lblCodigo;
	@FXML
    private TextField txtRasaoSocial;
	@FXML
	private Label lblRasaoSocial;
	@FXML
    private TextField txtCnpj;
	@FXML
	private Label lblCnpj;
	@FXML
    private TextField txtNomeFantasia ;
	@FXML
	private Label lblNomeFantasia;
	@FXML
    private TextField txtEndereco ;
	@FXML
	private Label lblEndereco;
	@FXML
    private TextField txtCep;
	@FXML
	private Label lblCep;
	@FXML
    private TextField txtNumero;
	@FXML
	private Label lblNumero;
	@FXML
    private TextField txtUnidade;
	@FXML
	private Label lblUnidade;
	@FXML
    private TextField txtCidade;
	@FXML
	private Label lblCidade;
	@FXML
    private TextField txtEstado;
	@FXML
	private Label lblEstado;
	@FXML
    private Button btnCadastrarUniversidade;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
