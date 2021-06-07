import DadosVeiculo from "components/DadosVeiculo";
import Footer from "components/Footer";
import NavBar from "components/NavBar";  
import Pagination from "components/Pagination";

function ListaVeiculos() {
    return (
        <>
        <NavBar />               
        <div className="container">      
          <DadosVeiculo /> 
        </div>        
        </>
    );
  }
  
  export default ListaVeiculos;