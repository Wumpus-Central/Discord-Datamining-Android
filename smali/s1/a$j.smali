.class Ls1/a$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls1/a;->o(Landroid/graphics/Bitmap;Ljava/lang/String;)Lfc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/graphics/Bitmap;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:Ls1/a;


# direct methods
.method constructor <init>(Ls1/a;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls1/a$j;->m:Ls1/a;

    iput-object p2, p0, Ls1/a$j;->k:Landroid/graphics/Bitmap;

    iput-object p3, p0, Ls1/a$j;->l:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ls1/a$j;->m:Ls1/a;

    iget-object v1, p0, Ls1/a$j;->k:Landroid/graphics/Bitmap;

    iget-object v2, p0, Ls1/a$j;->l:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ls1/a;->n(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-void
.end method
