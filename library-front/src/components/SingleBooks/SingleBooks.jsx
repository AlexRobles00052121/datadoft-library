import classes from "./SingleBooks.module.scss";

const SingleBooks = ({ name = "", summary = " ", image = "", price = ""}) => {

    return(
        <article className={classes["card"]}>
            <figure>
                <img src = {image} alt = {name} />
            </figure>
            <h3>{name}</h3>
            <p>${price}</p>
            <p>{summary}</p>
        </article>
    );

}

export default SingleBooks;