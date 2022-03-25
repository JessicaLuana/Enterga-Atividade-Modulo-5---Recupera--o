import { useState, useRef } from 'react'
import './SectionCadastro.css'
import Api from '../../../Api/Api';

const Formulario = () => {
    const nome = useRef()
    const cpf = useRef()
    const email = useRef()
    const endereco = useRef()

    const [Nome, setNome] = useState("")
    const [CPF, setCpf] = useState("")
    const [Email, setEmail] = useState("")
    const [Endereco, setEndereco] = useState("")

    function enviarDados(event) {
        event.preventDefault()

        Api.post("/cadastro/", {
            nome: nome.current.value,
            cpf: cpf.current.value,
            email: email.current.value,
            endereco: endereco.current.value,
        }).then((res) => console.log(res.data)).catch((err) => console.log(err))
    }

    return (
        <section className="d-flex justify-content-center">
            <div className="card col-sm-6 p-3">
                <div className="mb-3">
                    <h4>Cadastro</h4>
                </div>
                <div className="mb-2"></div>
                <form action="" onSubmit={enviarDados}>
                    <div className="mb-2">
                        <label for="nome">Nome:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" ref={nome} placeholder="Nome" value={Nome} onChange={e => setNome(e.target.value)} />
                    </div>
                    <div className="mb-2">
                        <div className="mb-2">
                            <label for="nome">CPF:</label>
                            <input type="text" required className="form-control bg-light btn-outline-secondary" ref={cpf} placeholder="CPF" value={CPF} onChange={e => setCpf(e.target.value)} />
                        </div>
                        <label for="nome">Email:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" ref={email} placeholder="Email" value={Email} onChange={e => setEmail(e.target.value)} />
                    </div>
                    <div className="mb-2">
                        <label for="nome">Endereço:</label>
                        <input type="text" required className="form-control bg-light btn-outline-secondary" ref={endereco} placeholder="Estrada Matue, 56" Copacabana-RJ value={Endereco} onChange={e => setEndereco(e.target.value)} />
                    </div>
                    <div className="mb-2">
                        <br></br>
                        <button type="button" required className="btn btn-secondary btn-lg btn-block" onChange={e => alert(e.target.value)}>Cadastrar</button>
                    </div>
                </form>
            </div>
        </section >
    )
}
export default Formulario