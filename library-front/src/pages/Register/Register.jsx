import InputField from "../../components/Labels/InputFields";
import { Link, useNavigate } from 'react-router-dom';

export function register(){
    
    
    // eslint-disable-next-line react-hooks/rules-of-hooks
    const navigate = useNavigate();

    const handleRegistrer = (e) => {
        e.preventDefault();    
        navigate('/login');
    }

    return (
        <section className='login-registrer'>
            <div className='container-form' >
                <form className='my-form' onSubmit={handleRegistrer}>
                    <h1 className='title-form'>NoteMax</h1>
                    <InputField
                        type="text"
                        id="5"
                        name="nombre"
                        
                        placeholder="Your name..."
                    >
                        Name:
                    </InputField>
                    <InputField
                        type="text"
                        id="6"
                        name="user"
                        placeholder="Your user..."
                    >
                        User:
                    </InputField>


                    <InputField
                        type="password"
                        id="2"
                        name="Password"
                        placeholder="Your Password..."
                    >
                        Password:
                    </InputField>

                    <InputField
                        type="email"
                        id="7"
                        name="email"
                        placeholder="Your email..."
                    >
                        Email:
                    </InputField>



                    <InputField
                        type="tel"
                        id="8"
                        name="phone"
                        placeholder="Your phone number..."
                    >
                        Phone number:
                    </InputField>




                    <InputField
                        type="submit"
                        id="9"
                        name="submit"
                        value="Register"
                    >
                    </InputField>

                </form>

                <p>Already have and acount?<Link className='navLogin' to="/">Iniciar sesion</Link></p>

            </div>
        </section>
    )
}

export default register;