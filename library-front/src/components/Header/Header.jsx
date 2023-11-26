import classes from "./Header.module.scss";

function Header() {


    return (
        <header>
            <input className={classes["Header"]} 
            type="text" 
            placeholder="Buscar"/>
        </header>
    );
}

export default Header;
