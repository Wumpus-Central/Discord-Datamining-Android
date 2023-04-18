.class public final synthetic Lic/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc/b;


# instance fields
.field public final synthetic a:Lic/n;

.field public final synthetic b:Lic/d;


# direct methods
.method public synthetic constructor <init>(Lic/n;Lic/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/j;->a:Lic/n;

    iput-object p2, p0, Lic/j;->b:Lic/d;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lic/j;->a:Lic/n;

    iget-object v1, p0, Lic/j;->b:Lic/d;

    invoke-static {v0, v1}, Lic/n;->e(Lic/n;Lic/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
