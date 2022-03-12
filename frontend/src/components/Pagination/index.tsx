import { TypeMoviePage } from 'app/types/TypeMoviePage';
import { FaChevronLeft, FaChevronRight } from 'react-icons/fa';
import './styles.css';

type PaginationProps = {
  page: TypeMoviePage;
  onChange: Function;
};

const Pagination: React.FC<PaginationProps> = ({ page, onChange }) => {
  return (
    <div className='dsmovie-pagination-container'>
      <div className='dsmovie-pagination-box'>
        <button
          onClick={() => onChange(page.number - 1)}
          className='dsmovie-pagination-button'
          disabled={page.first}
        >
          <FaChevronLeft />
        </button>
        <p className='text-white fs-6'>{`${page.number + 1} de ${
          page.totalPages
        }`}</p>
        <button
          onClick={() => onChange(page.number + 1)}
          className='dsmovie-pagination-button'
          disabled={page.last}
        >
          {/* <FaChevronRight className='dsmovie-flip-horizontal' /> */}
          <FaChevronRight />
        </button>
      </div>
    </div>
  );
};

export { Pagination };
