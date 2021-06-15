import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom"; 

const Home = () => {
    return (
        <>
        <NavBar />
        <div className="container">
            <div className="jumbotron">
                <h1 className="display-4">Controle de Veículos</h1>
                <p className="lead">Controle o cadastro de seus veículos de maneira simples e organizada.</p>
                <hr />
                <p>Esta aplicação consiste em cadastrar e exibir informações de veículos a partir de dados fornecidos por um back end construído com Spring Boot.</p>
                <Link className="btn btn-warning btn-lg" to="/listarveiculos">
                    Acessar
                </Link>                
            </div>
        </div>
        <Footer />
        </>
    );
}

export default Home;