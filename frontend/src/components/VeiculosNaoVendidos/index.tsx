import axios from "axios";
import { NaoVendidos } from "types/veiculo";
import { BASE_URL } from "utils/requests";

type VeiculosNaoVendidos = {   
    veiculosNaoVendidos: number,
};

const VeiculosNaoVendidos = () => {
    let naoVendidos : VeiculosNaoVendidos = {veiculosNaoVendidos: 0};    
    axios.get(`${BASE_URL}/veiculos/nao-vendidos`)
        .then(response => {
                const data = response.data as NaoVendidos;
                
                console.log(data)
    })

    return (        
      <div>
        
      </div>
    );
}

export default VeiculosNaoVendidos;