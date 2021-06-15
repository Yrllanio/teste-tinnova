import Home from 'pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import ListaVeiculos from 'pages/ListarVeiculos';
import ListarVeiculos from 'pages/ListarVeiculos';


const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/listarveiculos">
                    <ListarVeiculos />
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;