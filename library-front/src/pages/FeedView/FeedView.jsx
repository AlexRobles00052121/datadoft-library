import classes from './FeedView.module.scss';
import SideBar from '../../components/SideBar/SideBar';
import Books from '../../components/Books/Books';
import { useEffect, useState } from 'react';


function FeedView( ) {
  const [books, setBooks] = useState([]);

  const fetchBooks = async () => {
    try {
      const response = await fetch('http://localhost:8080/book');
      const data = await response.json();
      setBooks(data);
    } catch (error) {
      console.error('Error fetching books:', error);
    }
  }

  useEffect(() => {
    fetchBooks();
  }, []);

  return (

    <div className={classes["feed-wrapper"]}>
      <SideBar />

      <section className={classes["feed"]}>
        <Books books={books} />
      </section>
    </div>
  );
}

export default FeedView;