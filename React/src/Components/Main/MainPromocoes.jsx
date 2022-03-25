import CardPromocao from './Cards/CardPromocao'
import Portoseguro from '../../assets/img/Porto seguro.jpg'
import Romenia from '../../assets/img/Romeniaa.jpeg'
import ComposdoJordão from '../../assets/img/Campos do jordão.png'
import viajamar from "../../assets/img/viajamar.png"
import './Main.css'

export default () => {
    return (
        <main className="container-fluid">
            <div class="">
                <center><img src={viajamar} class="" /></center>
            </div>
            <br></br>
            <h2 className="text-center">Promoções</h2>
            <></>
            <p className="text-center">As melhores preços para sua viagem. Venha conferir nossos pacotes e promoções. </p>
            <></>
            <div className="cards">
                <CardPromocao foto={Portoseguro}
                    titulo="Porto Seguro"
                    text="Porto Seguro na Bahia é um destino tradicional entre os viajantes de todo o Brasil. A cidade onde o país foi descoberto encanta por suas praias, festas, gastronomia, animação e pelos passeios que oferecem uma enorme gama de possibilidades."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Romenia}
                    titulo="Romênia"
                    text="A cultura forte desse povo se faz presente nas construções históricas espalhadas por suas cidades, bem como suas tradições folclóricas, encontradas nas cerâmicas, danças e bordados."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={ComposdoJordão}
                    titulo="Campos do Jordão"
                    text="A arquitetura de inspiração alemã dá um toque alpino à cidade, com florestas de pinheiros que oferecem uma refrescante alternativa ao calor das terras baixas. Com o horizonte repleto de picos verde-esmeralda, Campos do Jordão é
                        um excelente destino nas montanhas localizado nos trópicos."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Portoseguro}
                    titulo="Porto Seguro"
                    text="Porto Seguro na Bahia é um destino tradicional entre os viajantes de todo o Brasil. A cidade onde o país foi descoberto encanta por suas praias, festas, gastronomia, animação e pelos passeios que oferecem uma enorme gama de possibilidades."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={Romenia}
                    titulo="Romênia"
                    text="A cultura forte desse povo se faz presente nas construções históricas espalhadas por suas cidades, bem como suas tradições folclóricas, encontradas nas cerâmicas, danças e bordados."
                    valor="R$ 1899.99"
                />
                <CardPromocao foto={ComposdoJordão}
                    titulo="Campos do Jordão"
                    text="A arquitetura de inspiração alemã dá um toque alpino à cidade, com florestas de pinheiros que oferecem uma refrescante alternativa ao calor das terras baixas. Com o horizonte repleto de picos verde-esmeralda, Campos do Jordão é
                        um excelente destino nas montanhas localizado nos trópicos."
                    valor="R$ 1899.99"
                />
            </div>
        </main>
    );
}