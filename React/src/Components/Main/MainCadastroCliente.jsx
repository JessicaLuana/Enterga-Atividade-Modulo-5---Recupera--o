import viajamar from "../../assets/img/viajamar.png"
import SectionCadastro from "./Section/SectionCadastro";

export default () => {
    return (
        <main className="container-fluid">
            <div className="">
                <center><img src={viajamar} className="" /></center>
            </div>
            <SectionCadastro></SectionCadastro>
        </main>
    );
}