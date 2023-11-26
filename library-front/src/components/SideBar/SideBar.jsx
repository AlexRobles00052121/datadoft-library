import classes from "./SideBar.module.scss";

function SideBar (){
    return (
        <section className = {classes["SideButtons"]}>
            {
                
                
                <div>
                    <ul>
                        <li> <button> Todos </button> </li>
                        <li> <button>  acción </button> </li>
                        <li> <button>  terror </button> </li>
                        <li> <button>  comedia </button> </li>
                    </ul>
                </div>
        

            }
        </section>
    )
}

export default SideBar;