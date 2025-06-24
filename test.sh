echo "Chose the following options:"
echo -e "\t1. GET /api/hello"
echo -e "\t2. GET /api/coffees"
read option

case $option in
  1)
    curl http://localhost:8080/api/hello
    ;;
  2)
    curl http://localhost:8080/api/coffees
    ;;
  *)
    echo "Option is not available!"
    ;;
esac