import Card from "./Cards/Card";
import Section from "./Section/Section";
import Portoseguro from '../../assets/img/Porto seguro.jpg'
import Romenia from '../../assets/img/Romeniaa.jpeg'
import ComposdoJordão from '../../assets/img/Campos do jordão.png'
import SectionHome from "./Section/SectionHome";
import './Main.css'

export default () => {
    return (
        <main className="container-fluid">
            <div className="">
                <div className="_background"></div>
            </div>
            <br></br>
            <h1 className="text-center">Olá Viajantes!</h1>
            <br></br>
            <p className="text-center">Aqui na Viajamar você encontra os melhores preços para sua viagem. Venha conferir nossos pacotes e promoções. </p>
            <div className="cards">
                <Card foto={Portoseguro}
                    titulo="Porto Seguro"
                    text="Porto Seguro na Bahia é um destino tradicional entre os viajantes de todo o Brasil. A cidade onde o país foi descoberto encanta por suas praias, festas, gastronomia, animação e pelos passeios que oferecem uma enorme gama de possibilidades."
                />
                <Card foto={Romenia}
                    titulo="Romênia"
                    text="A cultura forte desse povo se faz presente nas construções históricas espalhadas por suas cidades, bem como suas tradições folclóricas, encontradas nas cerâmicas, danças e bordados."
                />
                <Card foto={ComposdoJordão}
                    titulo="Campos do Jordão"
                    text="A arquitetura de inspiração alemã dá um toque alpino à cidade, com florestas de pinheiros que oferecem uma refrescante alternativa ao calor das terras baixas. Com o horizonte repleto de picos verde-esmeralda, Campos do Jordão é
                        um excelente destino nas montanhas localizado nos trópicos."
                />
            </div>
            <Section></Section>
            <></>
            <SectionHome></SectionHome>
        </main>
    );
}