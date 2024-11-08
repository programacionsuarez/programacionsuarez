package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import co.edu.uniquindio.poo.controller.LoginVehiculosController;
import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Caja;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;

import java.time.LocalDate;
import co.edu.uniquindio.poo.App;


public class LoginVehiculosViewController {
    
    App app;
    LoginVehiculosController loginVehiculosController;
    ObservableList <Auto> listaAutos = FXCollections.observableArrayList();
    ObservableList <Moto> listaMotos = FXCollections.observableArrayList();
    ObservableList <Camioneta> listaCamionetas = FXCollections.observableArrayList();
    ObservableList <Vehiculo> listaVehiculos = FXCollections.observableArrayList();
    ObservableList<String> tipovehiculo = FXCollections.observableArrayList("Auto","Moto","Camioneta");
    ObservableList<Caja> tipocaja = FXCollections.observableArrayList(Caja.MANUAL, Caja.AUTOMATICA);
    Vehiculo vehiculoseleccionado;


    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAddCamioneta"
    private Button btnAddCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddMoto"
    private Button btnAddMoto; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddPlaca"
    private Button btnAddPlaca; // Value injected by FXMLLoader

    @FXML // fx:id="btnNextReserva"
    private Button btnNextReserva; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveAuto"
    private Button btnRemoveAuto; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveCamioneta"
    private Button btnRemoveCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnRemoveMoto"
    private Button btnRemoveMoto; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateAuto"
    private Button btnUpdateAuto; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateCamioneta"
    private Button btnUpdateCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="btnUpdateMoto"
    private Button btnUpdateMoto; // Value injected by FXMLLoader

    @FXML // fx:id="columnCaja"
    private TableColumn<Moto,String> columnCajaCambios; // Value injected by FXMLLoader

    @FXML // fx:id="columnCapacidadCarga"
    private TableColumn<Camioneta, String> columnCapacidadCarga; // Value injected by FXMLLoader

    @FXML // fx:id="columnMarcaAuto"
    private TableColumn<Auto,String> columnMarcaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="columnMarcaCamioneta"
    private TableColumn<Camioneta,String> columnMarcaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="columnMarcaMoto"
    private TableColumn<Moto,String> columnMarcaMoto; // Value injected by FXMLLoader

    @FXML // fx:id="columnModeloAuto"
    private TableColumn<Auto,String> columnModeloAuto; // Value injected by FXMLLoader

    @FXML // fx:id="columnModeloCamioneta"
    private TableColumn<Camioneta, String> columnModeloCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="columnModeloMoto"
    private TableColumn<Moto,String> columnModeloMoto; // Value injected by FXMLLoader

    @FXML // fx:id="columnNumeroPuertas"
    private TableColumn<Auto,String> columnNumeroPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="columnPlacaAuto"
    private TableColumn<Auto,String> columnPlacaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="columnPlacaCamioneta"
    private TableColumn<Camioneta, String> columnPlacaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="columnPlacaMoto"
    private TableColumn<Moto,String> columnPlacaMoto; // Value injected by FXMLLoader

    @FXML // fx:id="comboxCajaCambios"
    private ComboBox<Caja> comboxCaja; // Value injected by FXMLLoader

    @FXML // fx:id="tblAuto"
    private TableView<Auto> tblAuto; // Value injected by FXMLLoader

    @FXML // fx:id="tblCamioneta"
    private TableView<Camioneta> tblCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="tblMoto"
    private TableView<Moto> tblMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadCargaCamioneta"
    private TextField txtCapacidadCargaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaAuto"
    private TextField txtMarcaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaCamioneta"
    private TextField txtMarcaCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarcaMoto"
    private TextField txtMarcaMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloAuto"
    private TextField txtModeloAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloCamioneta"
    private TextField txtModeloCamioneta; // Value injected by FXMLLoader

    @FXML // fx:id="txtModeloMoto"
    private TextField txtModeloMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombreMoto"
    private TextField txtPlacaMoto; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroPuertasAuto"
    private TextField txtNumeroPuertasAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlacaAuto"
    private TextField txtPlacaAuto; // Value injected by FXMLLoader

    @FXML // fx:id="txtPlacaCamioneta"
    private TextField txtPlacaCamioneta; // Value injected by FXMLLoader

    @FXML
    void AddAuto(ActionEvent event) {

        String placa = txtPlacaAuto.getText();
        String marca = txtMarcaAuto.getText();
        String modelo = txtModeloAuto.getText();
        int numeroPuertas = Integer.parseInt(txtNumeroPuertasAuto.getText());
        boolean validacion = validarDatos(placa, marca, modelo);
        
    }

    @FXML
    void AddCamioneta(ActionEvent event) {
        String placa = txtPlacaCamioneta.getText();
        String marca = txtMarcaCamioneta.getText();
        String modelo = txtModeloCamioneta.getText();
        int capacidadCarga = Integer.parseInt(txtCapacidadCargaCamioneta.getText());
        boolean validacion = validarDatos(placa, marca, modelo);
        if(validacion);
    }

    @FXML
    void AddMoto(ActionEvent event) {
        String placa = txtPlacaMoto.getText();
        String marca = txtMarcaMoto.getText();
        String modelo = txtModeloMoto.getText();
        Caja caja = (Caja) comboxCaja.getValue();
        boolean validacion = validarDatos(placa, marca, modelo);

    }

    @FXML
    void UpdateAuto(ActionEvent event) {
        try{
            String placa = txtPlacaAuto.getText();
            String marca = txtMarcaAuto.getText();
            String modelo = txtModeloAuto.getText();
            int numeroPuertas = Integer.parseInt(txtNumeroPuertasAuto.getText());
            boolean validacion = validarDatos(placa, marca, modelo);
    
        }catch(Exception e){
            System.out.println("Error al actualizar el auto");
        }
    }

    @FXML
    void UpdateCamioneta(ActionEvent event) {
        try{
            String placa = txtPlacaCamioneta.getText();
            String marca = txtMarcaCamioneta.getText();
            String modelo = txtModeloCamioneta.getText();
            int capacidadCarga = Integer.parseInt(txtCapacidadCargaCamioneta.getText());
            boolean validacion = validarDatos(placa, marca, modelo);
          
        }catch(Exception e){
            System.out.println("Error al actualizar la camioneta");
        }
    }

    @FXML
    void UpdateMoto(ActionEvent event) {
        try{
            String placa = txtPlacaMoto.getText();
            String marca = txtMarcaMoto.getText();
            String modelo = txtModeloMoto.getText();
            Caja caja = (Caja) comboxCaja.getValue();
            boolean validacion = validarDatos(placa, marca, modelo);
           
        }catch(Exception e){
            System.out.println("Error al actualizar la moto");
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAddCamioneta != null : "fx:id=\"btnAddCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnAddMoto != null : "fx:id=\"btnAddMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnAddPlaca != null : "fx:id=\"btnAddPlaca\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnNextReserva != null : "fx:id=\"btnNextReserva\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveAuto != null : "fx:id=\"btnRemoveAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveCamioneta != null : "fx:id=\"btnRemoveCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnRemoveMoto != null : "fx:id=\"btnRemoveMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateAuto != null : "fx:id=\"btnUpdateAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateCamioneta != null : "fx:id=\"btnUpdateCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert btnUpdateMoto != null : "fx:id=\"btnUpdateMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert comboxCaja != null : "fx:id=\"comboxCajaCambios\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblAuto != null : "fx:id=\"tblAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblCamioneta != null : "fx:id=\"tblCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert tblMoto != null : "fx:id=\"tblMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtCapacidadCargaCamioneta != null : "fx:id=\"txtCapacidadCargaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaAuto != null : "fx:id=\"txtMarcaAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaCamioneta != null : "fx:id=\"txtMarcaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtMarcaMoto != null : "fx:id=\"txtMarcaMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloAuto != null : "fx:id=\"txtModeloAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloCamioneta != null : "fx:id=\"txtModeloCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtModeloMoto != null : "fx:id=\"txtModeloMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtPlacaMoto != null : "fx:id=\"txtNombreMoto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtNumeroPuertasAuto != null : "fx:id=\"txtNumeroPuertasAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtPlacaAuto != null : "fx:id=\"txtPlacaAuto\" was not injected: check your FXML file 'Vehiculo.fxml'.";
        assert txtPlacaCamioneta != null : "fx:id=\"txtPlacaCamioneta\" was not injected: check your FXML file 'Vehiculo.fxml'.";

    }

    private boolean validarDatos(String placa, String marca, String modelo) {
        if (placa.isEmpty() || marca.isEmpty() || modelo.isEmpty()) {
            return false;
        }
        return true;
    }

    private void initViewAuto(){
        initDataBindingAuto();
        obtenerVehiculos();
        tblAuto.getItems().clear();
        if(!listaAutos.isEmpty()){
            tblAuto.setItems(listaAutos);
        }
        listenerSelection();
        ocultarWidgets();
    }

    private void initDataBindingAuto(){
        columnPlacaAuto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        columnMarcaAuto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        columnModeloAuto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        columnNumeroPuertas.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getNumeroPuertas())));
    }

    private void initViewCamioneta(){
        initDataBindingCamioneta();
        obtenerVehiculos();
        tblCamioneta.getItems().clear();
        if(!listaCamionetas.isEmpty()){
            tblCamioneta.setItems(listaCamionetas);
        }
        listenerSelection();
        ocultarWidgets();
    }

    private void initDataBindingCamioneta(){
        columnPlacaCamioneta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        columnMarcaCamioneta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        columnModeloCamioneta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        columnCapacidadCarga.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getCapacidadCarga())));
    }

    private void initViewMoto(){
        initDataBindingMoto();
        obtenerVehiculos();
        tblMoto.getItems().clear();
        if(!listaMotos.isEmpty()){
            tblMoto.setItems(listaMotos);
        }
        listenerSelection();
        ocultarWidgets();
    }

    private void initDataBindingMoto(){
        columnPlacaMoto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPlaca()));
        columnMarcaMoto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
        columnModeloMoto.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
        columnCajaCambios.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCaja().toString()));
    }

    private void initView(){
        initViewAuto();
        initViewCamioneta();
        initViewMoto();
    }

    private void listenerSelection() {
        tblAuto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vehiculoseleccionado = newSelection;
            mostrarInformacionAuto((Auto)vehiculoseleccionado);
        });

        tblCamioneta.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vehiculoseleccionado = newSelection;
            mostrarInformacionCamioneta((Camioneta)vehiculoseleccionado);
        });

        tblMoto.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            vehiculoseleccionado = newSelection;
            mostrarInformacionMoto((Moto)vehiculoseleccionado);
        });
    }

    private void obtenerVehiculos(){
        Collection <Vehiculo> vehiculos = loginVehiculosController.obtenerlistaVehiculos(); 
        if (vehiculos != null) {
            listaVehiculos.addAll(vehiculos);
        }
    }

    private void mostrarInformacionAuto(Auto auto) {
        if (auto != null) {
            MostrarWidgetsSeleccion(auto);
            txtPlacaAuto.setText(auto.getPlaca());
            txtMarcaAuto.setText(auto.getMarca());
            txtModeloAuto.setText(auto.getModelo());
            txtNumeroPuertasAuto.setText(String.valueOf(auto.getNumeroPuertas()));
        } else {
            VaciarCampos(auto);
        }
    }

    private void mostrarInformacionCamioneta(Camioneta camioneta) {
        if (camioneta != null) {
            MostrarWidgetsSeleccion(camioneta);
            txtPlacaCamioneta.setText(camioneta.getPlaca());
            txtMarcaCamioneta.setText(camioneta.getMarca());
            txtModeloCamioneta.setText(camioneta.getModelo());
            txtCapacidadCargaCamioneta.setText(String.valueOf(camioneta.getCapacidadCarga()));
        } else {
            VaciarCampos(camioneta);
        }
    }

    private void mostrarInformacionMoto(Moto moto) {
        if (moto != null) {
            MostrarWidgetsSeleccion(moto);
            txtPlacaMoto.setText(moto.getPlaca());
            txtMarcaMoto.setText(moto.getMarca());
            txtModeloMoto.setText(moto.getModelo());
            comboxCaja.setValue(moto.getCaja());
        } else {
            VaciarCampos(moto);
        }
    }

    private void MostrarWidgetsSeleccion(Vehiculo vehiculo){
        if(vehiculo instanceof Auto){
            txtPlacaAuto.setVisible(true);
            txtMarcaAuto.setVisible(true);
            txtModeloAuto.setVisible(true);
            txtNumeroPuertasAuto.setVisible(true);
        }else if(vehiculo instanceof Camioneta){
            txtPlacaCamioneta.setVisible(true);
            txtMarcaCamioneta.setVisible(true);
            txtModeloCamioneta.setVisible(true);
            txtCapacidadCargaCamioneta.setVisible(true);
        }else if(vehiculo instanceof Moto){
            txtPlacaMoto.setVisible(true);
            txtMarcaMoto.setVisible(true);
            txtModeloMoto.setVisible(true);
            comboxCaja.setVisible(true);
        }
    }
    

    private void VaciarCampos(Vehiculo vehiculo){
        if(vehiculo instanceof Auto){
            txtPlacaAuto.clear();
            txtMarcaAuto.clear();
            txtModeloAuto.clear();
            txtNumeroPuertasAuto.clear();
        }else if(vehiculo instanceof Camioneta){
            txtPlacaCamioneta.clear();
            txtMarcaCamioneta.clear();
            txtModeloCamioneta.clear();
            txtCapacidadCargaCamioneta.clear();
        }else if(vehiculo instanceof Moto){
            txtPlacaMoto.clear();
            txtMarcaMoto.clear();
            txtModeloMoto.clear();
            comboxCaja.setValue(null);
        }
    }

    private void ocultarWidgets(){
        txtPlacaAuto.setVisible(false);
        txtMarcaAuto.setVisible(false);
        txtModeloAuto.setVisible(false);
        txtNumeroPuertasAuto.setVisible(false);
        txtPlacaCamioneta.setVisible(false);
        txtMarcaCamioneta.setVisible(false);
        txtModeloCamioneta.setVisible(false);
        txtCapacidadCargaCamioneta.setVisible(false);
        txtPlacaMoto.setVisible(false);
        txtMarcaMoto.setVisible(false);
        txtModeloMoto.setVisible(false);
        comboxCaja.setVisible(false);
    }

    private void limpiarseleccionAuto(Vehiculo auto){
        tblAuto.getSelectionModel().clearSelection();
        txtPlacaAuto.clear();
        txtMarcaAuto.clear();
        txtModeloAuto.clear();
        txtNumeroPuertasAuto.clear();
        VaciarCampos(auto);
    }

    private void limpiarseleccionCamioneta(Vehiculo camioneta){
        tblCamioneta.getSelectionModel().clearSelection();
        txtPlacaCamioneta.clear();
        txtMarcaCamioneta.clear();
        txtModeloCamioneta.clear();
        txtCapacidadCargaCamioneta.clear();
        VaciarCampos(camioneta);
    }   

    private void limpiarseleccionMoto(Vehiculo moto){
        tblMoto.getSelectionModel().clearSelection();
        txtPlacaMoto.clear();
        txtMarcaMoto.clear();
        txtModeloMoto.clear();
        comboxCaja.setValue(null);
        VaciarCampos(moto);
    }


}