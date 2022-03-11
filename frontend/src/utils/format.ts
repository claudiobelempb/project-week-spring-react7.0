const formatDate = (data: string): string => {
  return new Intl.DateTimeFormat('pt-BR').format(new Date(data));
};

const formatPrice = (value: number): string => {
  return value.toLocaleString('pt-br', {
    style: 'currency',
    currency: 'BRL'
  });
};

export { formatDate, formatPrice };
