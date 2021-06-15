export type Veiculo = {
    id: number;
    veiculo: string;
    marca: string;
    ano: number;
    descricao: string;
    vendido: boolean;
    created: string;
    updated: string;
}

export type VeiculoPage = {
    content?: Veiculo[];
    last: boolean;
    totalElements: number;
    totalPages: number;
    size?: number;
    number: number;
    first: boolean;
    numberOfElements?: number;
    empty?: boolean;
}

export type NaoVendidos = {
    veiculosNaoVendidos: number;
}