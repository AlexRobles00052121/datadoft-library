//import { useState } from 'react';
import InputField from '../../components/Labels/InputFields';
import '../AuthStyle.css';
import { Link, useNavigate } from 'react-router-dom';

function Login() {
    /* const [email, setEmail] = useState('');
    const [password, setPassword] = useState(''); */
    const navigate = useNavigate();


    const handleLogin = (e) => {

        e.preventDefault();    
        navigate('/principal');
    }

    return (
        <section className='login-registrer'>
            <div className="container-form">
                <h1 className='title-form'>Login</h1>
                <form className='my-form'>
                    <InputField
                        type="text"
                        id="1"
                        name="Username"
                        placeholder="Your Username..."
                    >
                        Username:
                    </InputField>

                    <InputField
                        type="password"
                        id="2"
                        name="Password"
                        placeholder="Your Password..."
                    >
                        Password:
                    </InputField>
                </form>

                <InputField
                    type="submit"
                    id="2"
                    name="submit"
                    value="Log in"
                    onClick={handleLogin}
                >
                </InputField>
                <p>Don&rsquo;t have an account? <Link className='navLogin' to="/register">Registrarse</Link></p>
            </div>
        </section>
    );
}

export default Login;
