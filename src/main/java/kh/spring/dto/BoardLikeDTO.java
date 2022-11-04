package kh.spring.dto;

public class BoardLikeDTO {
   private int seq;
   private String id;
   private int parent_seq;
   
   public BoardLikeDTO() {
      super();
   }
   public BoardLikeDTO(int seq, String id, int parent_seq) {
      super();
      this.seq = seq;
      this.id = id;
      this.parent_seq = parent_seq;
   }
   public int getSeq() {
      return seq;
   }
   public void setSeq(int seq) {
      this.seq = seq;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public int getParent_seq() {
      return parent_seq;
   }
   public void setParent_seq(int parent_seq) {
      this.parent_seq = parent_seq;
   }
   
}