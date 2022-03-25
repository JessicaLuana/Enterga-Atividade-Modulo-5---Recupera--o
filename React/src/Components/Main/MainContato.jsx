import viajamar from "../../assets/img/viajamar.png"
import SectionContato from "./Section/SectionContato"
import './MainContato.css'

export default () => {
    return (
        <main className="container-fluid">
            <div class="">
                <center><img src={viajamar} class="" /></center>
            </div>
            <SectionContato></SectionContato>
        </main>
    );
}