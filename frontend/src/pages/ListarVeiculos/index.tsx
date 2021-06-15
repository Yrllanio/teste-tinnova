import DadosVeiculo from "components/DadosVeiculo";
import NavBar from "components/NavBar";  


function ListarVeiculos() {
    return (
        <>
        <NavBar />                      
        <div className="container">                
          <DadosVeiculo />
        </div>             
        </>
        
    );
  }
  
  export default ListarVeiculos;