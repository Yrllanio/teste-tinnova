import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { VeiculoPage } from "types/veiculo";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

const DadosVeiculo = () => {
    const [activePage, setActivePage] = useState(0);
    const [page, setPage] = useState<VeiculoPage>({
        first: true,
        last: true,
        number: 0,
        totalElements: 0,
        totalPages: 0,
    });

    useEffect(() => {        
        axios.get(`${BASE_URL}/veiculos?page=${activePage}&size=12&sort=id,asc`)
            .then(response => {
                setPage(response.data);
            });
    }, [activePage]);

    const changePage = (index: number) => {
        setActivePage(index);
    };

    return (
        <>  <Pagination page={page} onPageChange={changePage} />
            <div className="table-responsive">
                <table className="table table-striped table-sm">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Veiculo</th>
                            <th>Marca</th>
                            <th>Ano</th>
                            <th>Descrição</th>
                            <th>Vendido</th>
                            <th>Criado</th>
                            <th>Atualizado</th>
                        </tr>
                    </thead>
                    <tbody>
                        {page.content?.map(item => (
                            <tr key={item.id}>
                                <td>{(item.id)}</td>
                                <td>{(item.veiculo)}</td>
                                <td>{(item.marca)}</td>
                                <td>{(item.ano)}</td>
                                <td>{(item.descricao)}</td>
                                <td>{(item.vendido ? 'SIM' : 'NÃO')}</td>
                                <td>{formatLocalDate(item.created, "dd/MM/yyyy")}</td>
                                <td>{formatLocalDate(item.updated, "dd/MM/yyyy")}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

export default DadosVeiculo;