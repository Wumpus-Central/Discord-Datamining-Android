.class public final synthetic Lic/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc/b;


# instance fields
.field public final synthetic a:Lic/i;


# direct methods
.method public synthetic constructor <init>(Lic/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/o;->a:Lic/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lic/o;->a:Lic/i;

    invoke-static {v0}, Lic/n$b;->a(Lic/i;)Lic/i;

    move-result-object v0

    return-object v0
.end method
