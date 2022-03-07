import { FaChevronLeft, FaChevronRight } from 'react-icons/fa';
import './styles.css';
const Pagination: React.FC = () => {
  return (
    <div className='dsmovie-pagination-container'>
      <div className='dsmovie-pagination-box'>
        <button className='dsmovie-pagination-button' disabled={true}>
          <FaChevronLeft />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className='dsmovie-pagination-button' disabled={false}>
          {/* <FaChevronRight className='dsmovie-flip-horizontal' /> */}
          <FaChevronRight />
        </button>
      </div>
    </div>
  );
};

export { Pagination };
