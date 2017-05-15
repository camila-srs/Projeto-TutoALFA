package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class MenuControle implements Initializable {
	
	@FXML
	private Pane paneInicial;
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	    // metodo para abrir tela de cadastro de parceiro ---FUNCIONANDO
		@FXML 
		public void abrirCadastrarColaborador(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/CadastrarColaborador.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		
		@FXML 
		public void abrirCadastrarCurso(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/CadastroCurso.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		@FXML 
		public void abrirCadastrarDepartamento(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/CadastroDepartamento.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		
		@FXML 
		public void abrirCadastrarCategoria(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/CadastroCategoria.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		
		@FXML 
		public void abrirCadastrarUniversidade(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/CadastroUniversidade.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		
		@FXML 
		public void abrirCadastrarOcorrencia(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/RegistroOcorrência.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}
		
		@FXML 
		public void abrirCadastarTutoria(ActionEvent event)throws IOException {
			
			URL arquivoFXML;
			arquivoFXML = getClass().getResource("/Visao/ConsultaTutor.fxml");
			Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
			paneInicial.getChildren().clear();
			paneInicial.getChildren().add(fxmlParent);
			
		}

}
