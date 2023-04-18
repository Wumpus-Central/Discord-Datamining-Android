.class Lce/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/henninghall/date_picker/pickers/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lce/a;->a(Lde/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lde/g;

.field final synthetic b:Lce/a;


# direct methods
.method constructor <init>(Lce/a;Lde/g;)V
    .locals 0

    iput-object p1, p0, Lce/a$a;->b:Lce/a;

    iput-object p2, p0, Lce/a$a;->a:Lde/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lce/a$a;->b:Lce/a;

    invoke-static {v0}, Lce/a;->b(Lce/a;)Lbe/e;

    move-result-object v0

    iget-object v1, p0, Lce/a$a;->a:Lde/g;

    invoke-interface {v0, v1}, Lbe/e;->a(Lde/g;)V

    return-void
.end method
