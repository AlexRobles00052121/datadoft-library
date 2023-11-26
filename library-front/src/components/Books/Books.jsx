import SingleBooks from "../SingleBooks/SingleBooks";
import classes from "./Books.module.scss";

const Books = ({ books = [] }) => {
    const mappedBooks = books.map((book) => {
        return (
            <SingleBooks
                key={book.id}
                name={book.name}
                summary={book.summary}
                price={book.price}
                image={book.image}
            />
        );
    });

    return(
        <section>
            <div className={classes["books"]}>
                {mappedBooks}
            </div>
        </section>
    );
}

export default Books;