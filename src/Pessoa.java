
public class Pessoa {
	public class pessoa {
		
		//coisas a serem herdadas
		private String Nome;
		private String Endereco;
		private int Cep;
		private String Cidade;
		private String Estado;
		//=================
		
		public void construtor() {
			//vazio memo
		}
			//gets e sets
		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			this.Nome = nome;
		}

		public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String endereco) {
			this.Endereco = endereco;
		}

		public int getCep() {
			return Cep;
		}

		public void setCep(int cep) {
			this.Cep = cep;
		}

		public String getCidade() {
			return Cidade;
		}

		public void setCidade(String cidade) {
			this.Cidade = cidade;
		}

		public String getEstado() {
			return Estado;
		}

		public void setEstado(String estado) {
			this.Estado = estado;
		}
		
	}

}
