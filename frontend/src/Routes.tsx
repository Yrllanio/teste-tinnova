import Home from 'pages/Home';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import ListaVeiculos from 'pages/ListaVeiculos';


const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>
                <Route path="/" exact>
                    <Home />
                </Route>
                <Route path="/listaveiculos">
                    <ListaVeiculos />
                </Route>
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;