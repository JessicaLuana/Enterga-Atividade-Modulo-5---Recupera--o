import viajamar from "../../assets/img/viajamar.png"
import SectionDestino from "./Section/SectionDestino";

export default () => {
    return (
        <main className="container-fluid">
            <div class="">
                <center><img src={viajamar} class="" /></center>
            </div>
            <SectionDestino></SectionDestino>
        </main>
    );
}